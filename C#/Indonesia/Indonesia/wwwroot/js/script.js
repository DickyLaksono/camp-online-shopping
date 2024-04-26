const navbar = document.querySelector(".navbar");
const navigation = document.querySelector(".navigation");

window.addEventListener("scroll", function () {
  let scrollPosition = window.scrollY;

  if (scrollPosition > 80) {
    navbar.classList.add("nav-opacity");
  } else {
    navbar.classList.remove("nav-opacity");
  }
});
window.addEventListener("scroll", function () {
  let scrollPosition = window.scrollY;

  if (scrollPosition > 630) {
    navigation.classList.add("navigation-opacity");
  } else {
    navigation.classList.remove("navigation-opacity");
  }

    if (scrollPosition > 14400) {
        navigation.classList.remove("navigation-opacity");
    }
});

// Carousel
const carouselContainer = document.querySelector(".carousel-container");
const thumb = document.querySelectorAll(".thumb");

thumb.forEach(function (t) {
  t.addEventListener("click", function (e) {
    let imgeUrl = t.getAttribute("data-src");
    carouselContainer.style.backgroundImage = "url('" + imgeUrl + "')";
    carouselContainer.classList.add("fade");
    setTimeout(function () {
      carouselContainer.classList.remove("fade");
    }, 1000);
  });
});

// Carousel Trip.html
const jumbo1 = document.querySelector(".jumbo1");
const thumb1 = document.querySelectorAll(".thumb1");

thumb1.forEach(function (t1) {
  t1.addEventListener("click", function (e) {
    let t1Src = t1.getAttribute("src");
    jumbo1.setAttribute("src", t1Src);
    jumbo1.classList.add("fade");
    setTimeout(function () {
      jumbo1.classList.remove("fade");
    }, 1000);
  });
});
const jumbo2 = document.querySelector(".jumbo2");
const thumb2 = document.querySelectorAll(".thumb2");

thumb2.forEach(function (t2) {
  t2.addEventListener("click", function (e) {
    let t2Src = t2.getAttribute("src");
    jumbo2.setAttribute("src", t2Src);
    jumbo2.classList.add("fade");
    setTimeout(function () {
      jumbo2.classList.remove("fade");
    }, 1000);
  });
});
const jumbo3 = document.querySelector(".jumbo3");
const thumb3 = document.querySelectorAll(".thumb3");

thumb3.forEach(function (t3) {
  t3.addEventListener("click", function (e) {
    let t3Src = t3.getAttribute("src");
    jumbo3.setAttribute("src", t3Src);
    jumbo3.classList.add("fade");
    setTimeout(function () {
      jumbo3.classList.remove("fade");
    }, 1000);
  });
});
const jumbo4 = document.querySelector(".jumbo4");
const thumb4 = document.querySelectorAll(".thumb4");

thumb4.forEach(function (t4) {
  t4.addEventListener("click", function (e) {
    let t4Src = t4.getAttribute("src");
    jumbo4.setAttribute("src", t4Src);
    jumbo4.classList.add("fade");
    setTimeout(function () {
      jumbo4.classList.remove("fade");
    }, 1000);
  });
});
const jumbo5 = document.querySelector(".jumbo5");
const thumb5 = document.querySelectorAll(".thumb5");

thumb5.forEach(function (t5) {
  t5.addEventListener("click", function (e) {
    let t5Src = t5.getAttribute("src");
    jumbo5.setAttribute("src", t5Src);
    jumbo5.classList.add("fade");
    setTimeout(function () {
      jumbo5.classList.remove("fade");
    }, 1000);
  });
});
const jumbo6 = document.querySelector(".jumbo6");
const thumb6 = document.querySelectorAll(".thumb6");

thumb6.forEach(function (t6) {
  t6.addEventListener("click", function (e) {
    let t6Src = t6.getAttribute("src");
    jumbo6.setAttribute("src", t6Src);
    jumbo6.classList.add("fade");
    setTimeout(function () {
      jumbo6.classList.remove("fade");
    }, 1000);
  });
});
const jumbo7 = document.querySelector(".jumbo7");
const thumb7 = document.querySelectorAll(".thumb7");

thumb7.forEach(function (t7) {
  t7.addEventListener("click", function (e) {
    let t7Src = t7.getAttribute("src");
    jumbo7.setAttribute("src", t7Src);
    jumbo7.classList.add("fade");
    setTimeout(function () {
      jumbo7.classList.remove("fade");
    }, 1000);
  });
});
const jumbo8 = document.querySelector(".jumbo8");
const thumb8 = document.querySelectorAll(".thumb8");

thumb8.forEach(function (t8) {
  t8.addEventListener("click", function (e) {
    let t8Src = t8.getAttribute("src");
    jumbo8.setAttribute("src", t8Src);
    jumbo8.classList.add("fade");
    setTimeout(function () {
      jumbo8.classList.remove("fade");
    }, 1000);
  });
});
const jumbo9 = document.querySelector(".jumbo9");
const thumb9 = document.querySelectorAll(".thumb9");

thumb9.forEach(function (t9) {
  t9.addEventListener("click", function (e) {
    let t9Src = t9.getAttribute("src");
    jumbo9.setAttribute("src", t9Src);
    jumbo9.classList.add("fade");
    setTimeout(function () {
      jumbo9.classList.remove("fade");
    }, 1000);
  });
});
const jumbo10 = document.querySelector(".jumbo10");
const thumb10 = document.querySelectorAll(".thumb10");

thumb10.forEach(function (t10) {
  t10.addEventListener("click", function (e) {
    let t10Src = t10.getAttribute("src");
    jumbo10.setAttribute("src", t10Src);
    jumbo10.classList.add("fade");
    setTimeout(function () {
      jumbo10.classList.remove("fade");
    }, 1000);
  });
});

//
//
//
