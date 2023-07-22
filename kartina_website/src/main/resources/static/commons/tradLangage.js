const id = document.getElementById('fr');
const id2 = document.getElementById('fr2');
const flag = document.getElementById('flag');
const flag2 = document.getElementById('flag2');

id.addEventListener('click', selectLangage);
id2.addEventListener('click', selectLangage);

function selectLangage() {
    const expr = this.value;
    switch (expr) {
        case 'English':
            flag.src = "https://i.postimg.cc/50hb6JfQ/english-Flag.png"
            flag2.src = "https://i.postimg.cc/50hb6JfQ/english-Flag.png"
            id.value = 'English';
            id2.value = 'English';
            // window.location.href = "./page_home.eng.html";
            break;
        case 'Español':
            flag.src = "https://i.postimg.cc/0j0FP1js/spanish-Flag.png"
            flag2.src = "https://i.postimg.cc/0j0FP1js/spanish-Flag.png"
            id.value = 'Español';
            id2.value = 'Español';
            // window.location.href = "./page_home.eng.html";
            break;
        case 'Français':
            flag.src = "https://i.postimg.cc/KcntcKsD/french-Flag.png"
            flag2.src = "https://i.postimg.cc/KcntcKsD/french-Flag.png"
            id.value = 'Français';
            id2.value = 'Français';
            // window.location.href = "./page_home.eng.html";
            break;
    }

}