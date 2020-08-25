function validate() {
	var temp = document.getElementById("un").value;
	if (temp.length < 3) {
		alert("username ican tbe less than 2 ch");
		return false;
	} else
		return true;
}