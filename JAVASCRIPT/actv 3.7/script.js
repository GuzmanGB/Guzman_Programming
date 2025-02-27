function gestionarMenuNav() {
    var menu = document.getElementById('menu-desplegue');

    if (menu.classList.contains("menu-desplegado")) {
        menu.classList.remove("menu-desplegado");
    }

    else {
        menu.classList.add("menu-desplegado");
    }

}

var searchBar = document.getElementById('searchBar');
var productDivs = document.querySelectorAll('#divImagenes > div');


searchBar.addEventListener('input', function() {
    var searchTerm = searchBar.value.toLowerCase();

    let found = false;

    productDivs.forEach(div => {
        var h4Text = div.querySelector('h4').textContent.toLowerCase();

        if (h4Text.includes(searchTerm)) {
            div.style.display = 'inline-block'; 
            found = true; 
        } 
        
        else {
            div.style.display = 'none';
        }
    });

    var noResultsMessage = document.getElementById('no-results');
    
    if (!found) {
        noResultsMessage.style.display = 'block';
    } 
    
    else {
        noResultsMessage.style.display = 'none';
    }

});
