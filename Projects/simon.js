let gemeSeq=[];
let userSeq=[];
let h2=document.querySelector("h2");

let btns=["red", "blue", "green", "orange"];

let started=false;
let level=0;


document.addEventListener("keypress",function(){
    if(started==false){
        console.log("game is started");
        started=true;


        levelUp();
    }

});


function btnFlash(btn){
    btn.classList.add("flash");
    setTimeout(function(){
        btn.classList.remove("flash");
    }, 1000);
}


function levelUp(){
    level++;
    h2.innerText=`Level ${level}`;
    let randomIdxex=Math.floor(Math.random()*3);
    let randomBtn=btns[randomIdxex];
    let randombtn=document.querySelector(`.${randomBtn}`);
    btnFlash(randombtn);
    
//random btn choose
    btnFlash();

}