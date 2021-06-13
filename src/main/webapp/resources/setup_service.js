var showForm = document.getElementsByClassName('show-form');
console.log(showForm[0]);

var btnThem = document.getElementsByClassName('btn-them');
console.log(btnThem[0]);

var layout = document.getElementsByClassName('layout');
function showform(){
    showForm[0].style.display = 'block';
    layout[0].style.display ='block';
}
function offshowform(){
    showForm[0].style.display = 'none';
    layout[0].style.display = 'none';
}
function reply_click(clicked_id)
{
    alert(clicked_id);
}