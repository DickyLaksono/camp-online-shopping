/**
 * 
 */

 function getPilihanComputer() {
  const comp = Math.random();

  if (comp < 0.34) return "gajah";
  if (comp >= 0.34 && comp < 0.67) return "orang";
  return "semut";
}

function getHasil(comp, player) {
	
	
  if (player == comp) return "DRAW!";
  if (player == "gajah") {
	 
	   if(comp == "orang") {
		    num += 10;
	  		countdown(num);
		 return "WIN!"
		  }else{
			return  "LOSE!"
			  };
  }
  if (player == "orang") { if(comp == "gajah") {
	  return "LOSE!"
	  }else {
		  num += 10;
	  		countdown(num);
		  return "WIN!"
		  };
  }
  if (player == "semut") { if(comp == "orang"){  		
	  return "LOSE"
	  }else{
		  num += 10;
	  		countdown(num);
		  return "WIN!"
	   };
	}
  
}



function putar() {
  const imgComputer = document.querySelector(".img-komputer");
  const gambar = ["gajah", "semut", "orang"];
  let i = 0;
  const waktuMulai = new Date().getTime();
  setInterval(function () {
    if (new Date().getTime() - waktuMulai > 1000) {
      clearInterval;
      return;
    }

    imgComputer.setAttribute("src", " img/" + gambar[i++] + ".jpeg");
    if (i == gambar.length) i = 0;
  }, 100);
}

const pilihan = document.querySelectorAll("li img");
pilihan.forEach(function (pil) {
  //untuk setiap nodelist yang ada di pikihan, jalankan function

  pil.addEventListener("click", function () {
    const pilihanComputer = getPilihanComputer();
    const pilihanPlayer = pil.className;
    const hasil = getHasil(pilihanComputer, pilihanPlayer);

    putar();

    //nuggu dulu selama 1 detik
    setTimeout(function () {
      const imgComputer = document.querySelector(".img-komputer");
      imgComputer.setAttribute("src", "img/" + pilihanComputer + ".jpeg");

      const info = document.querySelector(".info");
      info.innerHTML = hasil;
    }, 1000);
  });
});


// timer 
const timerSpan = document.querySelector("#timer");

let num = 2;
function countdown(second) {
  const timerInterval = setInterval(function () {
    if (second >= 0) {
      timerSpan.innerHTML = second--;
    } else {
      if (second < 0) {
		  
		  $("#janken").show();
      }
      clearInterval(timerInterval);
    }
  }, 1000);
}

countdown(num);




