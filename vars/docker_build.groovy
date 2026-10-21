def call(String NameOfDockerImage){
  sh 'docker build -t "${NameOfDockerImage} . "
}
