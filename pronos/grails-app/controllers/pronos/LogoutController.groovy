package pronos

import grails.plugin.springsecurity.SpringSecurityUtils

class LogoutController {

/**
 * Index action. Redirects to the Spring security logout uri.
 */
    def index() {
        redirect uri: SpringSecurityUtils.securityConfig.logout.filterProcessesUrl
    }
}

