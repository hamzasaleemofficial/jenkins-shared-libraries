 def call(String ProjectName, String ImageTag, String dockerhubuser){
   withCredentials([usernamePassword(credentialsId:'dockerhubcred',usernameVariable:'dockerhubuser', passwordVariable:'dockerhubpass')])
   {
                sh 'echo $dockerhubpass | docker login -u $dockerhubuser --password-stdin'
   
                 sh "docker push ${dockerhubuser}/${ProjectName}:${ImageTag}"
 }
 }
