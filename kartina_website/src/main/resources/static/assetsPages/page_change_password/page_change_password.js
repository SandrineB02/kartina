// const error = document.getElementByClassName("popup");
// document.getElementByClassName("popup").innerText =
// 'Les champs ne sont pas remplis';

{/* <body>
    <div id="container">
        <h1 id="first-h1">Hello World</h1>

        <!-- <button id="change-style" onmouseover="changeStyle();">Changer le style</button> -->
        <button id="change-style">Changer le style</button>

    </div>

    <script>
        const h1 = document.getElementById('first-h1');
        const btn = document.getElementById('change-style');

        const changeStyle = () => {
            h1.classList.toggle('h1-change');
            if (h1.classList.contains('h1-change')) {
                btn.innerText = "Revenir au style précédent";
            } else {
                btn.innerText = "Changer le style";
            }
        }

        btn.addEventListener('mouseover', changeStyle)

        setTimeout( () => {
            btn.removeEventListener('mouseover', changeStyle)
        }, 10_000)
    </script> */}

function validation(f) {

    if (f.mdp1.value == '' || f.mdp2.value == '') {
        f.mdp1.focus();
        return false;
    }
    else if (f.mdp1.value != f.mdp2.value) {
        alert('Ce ne sont pas les mêmes mots de passe!');
        f.mdp1.focus();
        return false;
    }
    else if (f.mdp1.value == f.mdp2.value) {
        alert('Ce sont les mêmes mots de passe!');
        return true;
    }
    else {
        f.mdp1.focus();
        return false;
    }
}