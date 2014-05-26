import pronos.User
import pronos.UserRole
import pronos.Role

class BootStrap {

    def init = { servletContext ->
    	createDefaultUser()
    }
    def destroy = {
    }

    private void createDefaultUser(){
// If admin not here create him
//        def roleUser = Role.findByAuthority('ROLE_USER')
//        if( !roleUser )
//        {
//            log.error("Boostrap ERROR : create ROLE_USER first !")
//            return
//        }
          def roleUser = Role.findByAuthority('ROLE_USER')
	  if( !roleUser )
		roleUser = new Role(authority: 'ROLE_USER',description:'User role').save(flush:true)

          def user = User.findByUsername('user')
          if ( ! user ){
      	  user = new User(
	       username : 'user',
	       password : 'user',
	       firstname : 'user',
	       lastname : 'user',
	       activated : 1
	       ).save(flush:true)

	       UserRole.create user, roleUser, true
          }

//      def admin = User.findByUsername('admin')
//      if ( ! admin ){
//      	 admin = new User(
//	       username : 'admin',
//	       password : 'admin',
//	       firstname : 'admin',
//	       lastname : 'admin',
//	       activated : 1
//	       ).save(flush:true)
//      }
    }


}
