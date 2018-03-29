function loadSkills() {

	 $.get("/hexa/getSkills", function(data, status){  
 	 	document.getElementById("skillDiv").appendChild(data);
 	});
}