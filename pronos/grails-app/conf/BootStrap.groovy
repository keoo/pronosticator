import game.User

class BootStrap {

    def init = { servletContext ->
    	createDefaultUser()
    }
    def destroy = {
    }

    private void createDefaultUser(){
// If admin not here create him

      def admin = User.findByUsername('administrator')
      if ( ! admin ){
      	 admin = new User(
	       firstname : 'admin',
	       lastname : 'admin',
	       username : 'admin',
	       password : 'admin',
	       email : 'kevin.coulomb@sysfera.com',
	       activated : 1,
	       isAdmin : true
	       ).save(flush:true)
      }
    }


}
