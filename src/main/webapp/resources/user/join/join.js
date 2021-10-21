const checkBtn = document.querySelector("#id_check_btn");
const path = document.querySelector("#path").value;
const idPermission = document.querySelector("#id_permission");

////////////////////////////////아이디 핸들러
let idFlag = false;

function idCheckHandler(event) {
	event.preventDefault();
	const id = document.querySelector("#id").value;
    const url = path + "/user/idCheck?id=" + id;
    const opt = {
        method:"GET"
    };

    fetch(url, opt)
	.then(resp => resp.text())
	.then(text => {
		if(text != "1") {
			idPermission.innerHTML = "사용가능한 아이디입니다.";
			idPermission.style.color = "green";
			idFlag = true;
		}
		else {
			idPermission.innerHTML = "중복된 아이디입니다.";
			idPermission.style.color = "red";
		}
		
		if(id == "") idPermission.innerHTML = "필수항목입니다.";
	})
}

checkBtn.addEventListener('click', function(){idCheckHandler(event)});

/////////////////////// 비밀번호 핸들러
let passwordFlag = false;
const passwordRule = document.querySelector("#password_rule")

function passwordCheckHandler(event) {
	const password = document.querySelector("#password").value;
	const passwordCheck = document.querySelector("#password_check").value;
	
	if(password == passwordCheck) {
		passwordFlag = true;
		passwordRule.innerHTML = "사용가능한 비밀번호입니다.";
		passwordRule.style.color = "green";
	}
	else {
		passwordRule.style.color = "red";
		passwordRule.innerHTML = "비밀번호가 일치하지 않습니다.";
	}
	
}

document.querySelector("#password_check").addEventListener('keyup', passwordCheckHandler);

///////////////////// 이름 핸들러
let nameFlag = false;

function nameHandler() {
	const name = document.querySelector("#name");
	if(name.value != "") nameFlag = true;
	else alert("이름은 필수항목입니다.");
}

document.querySelector("#name").addEventListener("blur", nameHandler);


//////////////////////// 서버 핸들러
let serverFlag = false;

function serverHandler() {
	const server = document.querySelector("#server");
	if(server.value != "") serverFlag = true;
	else alert("서버은 필수항목입니다.");
}

document.querySelector("#server").addEventListener("blur", serverHandler);

///////////// 폼 핸들러
function formSubmitHandler() {
	const joinForm = document.querySelector("#join_form");
	
	if(idFlag&&passwordFlag&&nameFlag&&serverFlag) joinForm.submit();
	else alert("필수항목을 모두 채워주세요.");
}

document.querySelector("#join_btn").addEventListener("click", formSubmitHandler);


