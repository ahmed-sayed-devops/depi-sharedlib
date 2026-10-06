package edu.depi;

def dockerBuild(IMAGE_NAME, IMAGE_TAG){
    sh "docker build -t ${IMAGE_NAME}:${IMAGE_TAG} ."
}

def dockerLogin(DOCKER_USERNAME, DOCKER_PASSWORD){
    sh "docker login -u ${DOCKER_USERNAME} -p ${DOCKER_PASSWORD}"
}

def dockerPush(IMAGE_NAME, IMAGE_TAG){
    sh "docker push ${IMAGE_NAME}:${IMAGE_TAG}"
}
