#!/usr/bin/groovy
def build() {
  "echo mvn clean deploy"
}
def test(name) {
  echo "/usr/local/bin/${name}"
}
def deploy(env,app) {
  echo "aws cloudformation create-stack "
  echo "--stack-name ${env}_{app)"
  echo "ParameterKey=Env,ParameterValue=${env}"
}
// AimTheory have a recommendation and explanation about this here
return this
