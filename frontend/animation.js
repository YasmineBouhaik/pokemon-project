let leftpic = document.getElementById('leftpic');
let rightpic = document.getElementById('rightpic');
let buttonclicked = document.getElementById('animation');
let pokeballpic = document.getElementById("animation");
let pokeballgame = document.getElementById("animation2");
let pokeballgame2 = document.getElementById("animation3");
console.log(buttonclicked);
var sample = document.getElementById("foobar");
sample.play();
buttonclicked.addEventListener('click', () => {
    leftpic.style.marginRight = '100%';
    rightpic.style.marginLeft = '100%';
    let fadeeffect = setInterval(function () {
        if (!pokeballpic.style.opacity) {
            pokeballpic.style.opacity = 1;
        }
        if (pokeballpic.style.opacity > 0) {
            pokeballpic.style.opacity -= 0.2;
        }
    }, 200);
     let pokeballapear = setInterval(function() {
         if (pokeballgame.style.display = "none")  {
            pokeballgame.style.display = "block";
         } 
        if ( pokeballgame.style.display = "block") {
             pokeballgame.style.animation = "hyperballappear ease-in 3s forwards";
        }
     }, 200)
     let pokeballapear2 = setInterval(function() {
        if (pokeballgame2.style.display = "none")  {
           pokeballgame2.style.display = "block";
        }  if ( pokeballgame2.style.display = "block") {
            pokeballgame2.style.animation = "masterballappear ease-in 3s forwards";
       }
    }, 300)


})
