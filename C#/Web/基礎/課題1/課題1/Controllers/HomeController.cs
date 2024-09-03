using Microsoft.AspNetCore.Mvc;
using System.Diagnostics;
using 課題1.Models;

namespace 課題1.Controllers
{
    public class HomeController : Controller
    {
        private readonly ILogger<HomeController> _logger;

        public HomeController(ILogger<HomeController> logger)
        {
            _logger = logger;
        }

        public IActionResult Index()
        {
            return View();
        }

        [HttpPost]
        public IActionResult Create()
        {
            ViewData["message"] = "ボタンが押されました";
            return View();
        }

        public IActionResult Edit()
        {
            ViewBag.Message = "編集が押されました";
            return View();
        }

        public IActionResult IsDelete()
        {
            ViewData["message"] = "削除していいですか？";
            return View();
        }

        [HttpPost]
        public IActionResult Delete()
        {
            TempData["message"] = "削除しました";
            return RedirectToAction("Index");
        }

        public IActionResult Privacy()
        {
            return View();
        }

        [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
        public IActionResult Error()
        {
            return View(new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier });
        }
    }
}
