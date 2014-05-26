package pronos


class UserService {
    /* Inject dependencies */
    def springSecurityService
    def grailsApplication

    boolean isLoggedIn() {
        springSecurityService.isLoggedIn()
    }

    def getCurrentUser() {
        springSecurityService.getCurrentUser()
    }

    def get(def id) {
        User.get(id)
    }

}