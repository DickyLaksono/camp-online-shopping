/**
 * 
 */

 
      $(document).ready(function () {
        // Fungsi untuk memilih tindakan komputer secara acak
        function pilihTindakanKomputer() {
          const tindakan = ["グー", "チョキ", "パー"];
          return tindakan[Math.floor(Math.random() * tindakan.length)];
        }

        // Fungsi untuk menentukan pemenang
        let countLose = 2;
        let countWin = 0;
        let num = 0;
        function tentukanPemenang(pilihanPemain, pilihanKomputer) {
          if (pilihanPemain === pilihanKomputer) {
            return "draw!";
          } else if ((pilihanPemain === "グー" && pilihanKomputer === "チョキ") || (pilihanPemain === "チョキ" && pilihanKomputer === "パー") || (pilihanPemain === "パー" && pilihanKomputer === "グー")) {
            countWin++;
            if (countWin >= 2) {
              countWin -= countWin;
              setTimeout(function () {
                num += 10;
                countdown(num);
                num -= num;
                $("#close").show();
              }, 1000);
            }
            return "勝った!";
          } else {
            countLose--;
            return "負けた!";
          }
        }

        // Munculkan modal secara otomatis saat halaman dimuat
        // $("#gameModal").modal("show");

        // Event handler saat tombol dipilih
        $(".btn").click(function () {
          const pilihanPemain = $(this).attr("id");
          const pilihanKomputer = pilihTindakanKomputer();
          const hasil = tentukanPemenang(pilihanPemain, pilihanKomputer);
          $(".result").text(`あなたは ${pilihanPemain} を選んだ, コンピューターは ${pilihanKomputer} を選んだ. 結果は: ${hasil}`);
        });
      });

//      const timerSpan = document.querySelector("#timer");
//
//      const random = Math.random();
//
//      function countdown(second) {
//        const timerInterval = setInterval(function () {
//          if (second >= 0) {
//            timerSpan.innerHTML = second--;
//          } else {
//            if (second < 0) {
//              $("#gameModal").modal("show"); // Menampilkan kembali modal permainan
//              $("#close").hide();
//            }
//            clearInterval(timerInterval);
//
//            // Timer mencapai 0, tampilkan modal quiz kembali
//            // quizModal.show();
//          }
//        }, 300);
//      }

      //countdown(points);
  
