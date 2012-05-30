grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

    inherits "global"
    log "warn"

    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()
        mavenCentral()
    }

    dependencies {
        compile("org.tmatesoft.svnkit:svnkit:1.7.4-v1") {
            excludes "jna", "trilead-ssh2", "sqljet"
        }
        test("org.gmock:gmock:0.8.1") {
            export = false
        }
    }

    plugins {
        build(":release:2.0.1") {
            excludes "svn"
            export = false
        }
    }
}
