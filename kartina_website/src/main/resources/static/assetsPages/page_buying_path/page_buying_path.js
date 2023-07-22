const precedent  = document.getElementById('precedent');
const suivant  = document.getElementById('suivant');
const confirmer = document.getElementById('confirmer');

const finition  = document.getElementById('finition');
const cadre  = document.getElementById('cadre');
const format  = document.getElementById('format');

const n1  = document.getElementById('n1');
const n2  = document.getElementById('n2');
const n3 = document.getElementById('n3');

const f1  = document.getElementById('f1');
const f2  = document.getElementById('f2');
const f3  = document.getElementById('f3');
const f4  = document.getElementById('f4');

const fscreen = document.getElementById('fscreen');
const fullscreen = document.getElementById('fullscreen');

const fi1  = document.getElementById('fi1');
const fi2  = document.getElementById('fi2');
const fi3  = document.getElementById('fi3');
const fi4  = document.getElementById('fi4');
const fi5  = document.getElementById('fi5');

const c1  = document.getElementById('c1');
const c2  = document.getElementById('c2');
const c3  = document.getElementById('c3');
const c4  = document.getElementById('c4');
const c5  = document.getElementById('c5');
const c6  = document.getElementById('c6');
const c7  = document.getElementById('c7');
const c8  = document.getElementById('c8');

let etape = 1;
let memory1 = 0;
let memory2 = 0;
let memory3 = 0;

suivant.addEventListener('click',pagesuivante);
confirmer.addEventListener('click',pagesuivante);
function pagesuivante(){
    if (etape == 1 && memory1 !== 0){
        format.style.display = "none";
        finition.style.display = "block";
        cadre.style.display = "none";
        precedent.style.display = "block";
        n1.src ="https://i.postimg.cc/FFSQ9Ykp/format-grand.png";
        confirmer.textContent ="Choisir cette finition";
        confirmer.disabled = true;
        etape ++;
        if(memory1 ==4){
            fi1.style.display ="none";
            fi2.style.display ="none";
            fi3.style.display ="none";
            fi4.style.display ="block";
            fi5.style.display ="block";
        }
        else{
            fi1.style.display ="block";
            fi2.style.display ="block";
            fi3.style.display ="block";
            fi4.style.display ="none";
            fi5.style.display ="none";
        }
        }else if (etape == 2 && memory2 !==0){
        format.style.display = "none";
        finition.style.display = "none";
        cadre.style.display = "block";
        suivant.style.display = "none";
        n2.src ="https://i.postimg.cc/FFSQ9Ykp/format-grand.png";
        confirmer.textContent ="Ajouter au panier"; // Revoir ce détail
        confirmer.disabled = true;
        etape ++;
        }
}

precedent.addEventListener('click',pageprecedente);
function pageprecedente(){
    if (etape == 2){
        format.style.display = "block";
        finition.style.display = "none";
        cadre.style.display = "none";
        precedent.style.display = "none";
        n1.src ="https://i.postimg.cc/k5hS4TDR/icon-Step1.png";
        memory2 = 0;
        confirmer.textContent ="Choisir ce format";
        confirmer.disabled = true;
        etape --;
        }else if (etape == 3){
        format.style.display = "none";
        finition.style.display = "block";
        cadre.style.display = "none";
        suivant.style.display = "block";
        n2.src ="https://i.postimg.cc/Qt2WgVQX/icon-Step2.png";
        memory3 = 0;
        confirmer.textContent ="Choisir cette finition";
        confirmer.disabled = true;
        etape --;
        }
    }

    f1.addEventListener('click',selected);
    f2.addEventListener('click',selected);
    f3.addEventListener('click',selected);
    f4.addEventListener('click',selected);

    function selected(){
        document.querySelectorAll(".select").forEach(element => {
            element.style.border = "none";
            // element.childNodes[5].childNodes[0].style.color = "none";
          });
        // this.childNodes[5].childNodes[0].style.color = "green";
        this.style.border = "green 2px solid";
        confirmer.disabled = false;
        memory1 = parseInt(this.id.substring(1));
    }

    function fullscreenLauncher(){
        fscreen.style.display = "block";
    }

    fi1.addEventListener('click',finiselected);
    fi2.addEventListener('click',finiselected);
    fi3.addEventListener('click',finiselected);
    fi4.addEventListener('click',finiselected);
    fi5.addEventListener('click',finiselected);

    function finiselected(){
        fi1.style.border = "none";
        fi2.style.border = "none";
        fi3.style.border = "none";
        fi4.style.border = "none";
        fi5.style.border = "none";
        //  this.childNodes[5].childNodes[0].style.border = "green 2px solid";
        this.style.border = "green 2px solid";
        confirmer.disabled = false;
        memory2 = parseInt(this.id.substring(2));
    }

    c1.addEventListener('click',cselected);
    c2.addEventListener('click',cselected);
    c3.addEventListener('click',cselected);
    c4.addEventListener('click',cselected);
    c5.addEventListener('click',cselected);
    c6.addEventListener('click',cselected);
    c7.addEventListener('click',cselected);
    c8.addEventListener('click',cselected);
  
    function cselected(){
        c1.style.border = "none";
        c2.style.border = "none";
        c3.style.border = "none";
        c4.style.border = "none";
        c5.style.border = "none";
        c6.style.border = "none";
        c7.style.border = "none";
        c8.style.border = "none";
        //  this.childNodes[5].childNodes[0].style.border = "green 2px solid";
        this.style.border = "green 2px solid";
        confirmer.disabled = false;
        memory3 = parseInt(this.id.substring(1));
    }
    
    n1.addEventListener('click',moveToStageBy1);


function moveToStageBy1() {
        etape = 1;
        memory1 = 0;
        memory2 = 0;
        memory3 = 0;
        format.style.display = "block";
        finition.style.display = "none";
        cadre.style.display = "none";
        precedent.style.display = "none";
        suivant.style.display = "block";
        n1.src ="https://i.postimg.cc/k5hS4TDR/icon-Step1.png";
        n2.src ="https://i.postimg.cc/Qt2WgVQX/icon-Step2.png";
        confirmer.textContent ="Choisir ce format";
        confirmer.disabled = true;
}

n2.addEventListener('click',moveToStageBy2);

function moveToStageBy2() {
    if (etape ==3){
        memory2 = 0;
        memory3 = 0;
        format.style.display = "none";
        finition.style.display = "block";
        cadre.style.display = "none";
        suivant.style.display = "block";
        n2.src ="https://i.postimg.cc/Qt2WgVQX/icon-Step2.png";
        confirmer.textContent ="Choisir cette finition";
        confirmer.disabled = true;
        etape --;
    }else if (etape ==1 && memory1 !== 0){
        format.style.display = "none";
        finition.style.display = "block";
        cadre.style.display = "none";
        precedent.style.display = "block";
        n1.src ="https://i.postimg.cc/FFSQ9Ykp/format-grand.png";
        confirmer.textContent ="Choisir cette finition";
        confirmer.disabled = true;
        etape ++;
    }
}

n3.addEventListener('click',moveToStageBy3);

function moveToStageBy3() {
    if (etape ==2 && memory2 !== 0){
        format.style.display = "none";
        finition.style.display = "none";
        cadre.style.display = "block";
        suivant.style.display = "none";
        n2.src ="https://i.postimg.cc/FFSQ9Ykp/format-grand.png";
        confirmer.textContent ="Ajouter au panier"; // Revoir ce détail
        confirmer.disabled = true;
        etape ++;
    }
}

fullscreen.addEventListener('click', () => {
  fscreen.style.display = 'grid';
  fscreen.style.placeItems = 'center';
});

fscreen.addEventListener('click', () => {
  fscreen.style.display = 'none';
});