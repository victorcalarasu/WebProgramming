function open(){
	$('#block').show();
}
function close(){
	$('#block').hide();
}

$(document).ready(function () {
    $('#closebutton').click(function () {
        close();
    });
    $('#opener').click(function () {
        open();
    });

});