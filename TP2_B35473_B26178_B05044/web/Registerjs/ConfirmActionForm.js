function confirmAction(idForm, message) {
    var result = confirm(message);
    if (result === true) {
        document.getElementById(idForm).submit();
        return true;
    } else {
        return false;
    }
}




