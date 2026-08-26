// Define function
def call(String ProjectName, String ImageTag){
   withCredentials([usernamePassword(credentialsId:'dockerhubcred',usernameVariable:'dockerhubuser', passwordVariable:'dockerhubpass')])
   {
               sh "docker build -t ${dockerhubuser}/${ProjectName}:${ImageTag} ."
 }
  
}
