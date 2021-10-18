const checkBtn = document.querySelector("#id_check_btn");
const path = document.querySelector("#path").value;
const idPermission = document.querySelector("#id_permission");

function idCheckHandler(event) {
	event.preventDefault();
    const url = path + "/user/idCheck";
    const opt = {
        method:"POST"
    };

    fetch(url, opt)
	.then(resp => resp.text())
	.then(text => console.log(text))
    
}

checkBtn.addEventListener('click', function(){idCheckHandler(event)});