String getVersionSuffix(Map config){

    if (config.isReleaseCandidate) {
        return config.rcNumber
    } else {
        return config.rcNumber + '+ci.' + env.BUILD_NUMBER
    }
}