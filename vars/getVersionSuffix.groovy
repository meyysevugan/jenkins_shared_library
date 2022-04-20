String getVersionSuffix(Map config){

    if (config.isReleaseCandidate) {
        return config.rcNumber
    } else {
        return env.rcNumber + '+ci.' + env.BUILD_NUMBER
    }
}