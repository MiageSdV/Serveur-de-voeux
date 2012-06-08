function effacerid(){
	document.getElementById( 'identifiant' ).value = "" ;
					}
					
function effacermdp(){
	document.getElementById( 'mot_de_passe' ).value = "" ;
					}
					
function remplirid(){
	if (!document.getElementById( 'identifiant' ).value){
			document.getElementById( 'identifiant' ).value = "Nom d'utilisateur";}
					}
					
function remplirmdp(){
	if (!document.getElementById( 'mot_de_passe' ).value ){
		document.getElementById( 'mot_de_passe' ).value = "Mot de passe" ;}
					}
