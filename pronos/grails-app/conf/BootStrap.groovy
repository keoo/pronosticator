import pronos.User
import pronos.Game
import pronos.UserRole
import pronos.Role
import java.text.SimpleDateFormat

class BootStrap {

    def init = { servletContext ->
    	createDefaultUser()
        createGames()
    }
    def destroy = {
    }

    private void createDefaultUser(){
          def roleUser = Role.findByAuthority('ROLE_USER')
	  if( !roleUser )
		roleUser = new Role(authority: 'ROLE_USER',description:'User role').save(flush:true)

          def roleAdmin = Role.findByAuthority('ROLE_ADMIN')
	  if( !roleAdmin )
		roleAdmin = new Role(authority: 'ROLE_ADMIN',description:'Admin role').save(flush:true)


      def admin = User.findByUsername('admin')
      if ( ! admin ){
      	 admin = new User(
	       username : 'admin',
	       password : 'admin',
	       firstname : 'admin',
	       lastname : 'admin',
	       activated : 1
	       ).save(flush:true)
	       UserRole.create admin, roleAdmin, true
      }
    }

    private void createGames(){
              def game = Game.findAll()
	      if (game) {
	      	 return
	      }


              Date d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-12")
	      def game1 = new Game(domicile: 'Brésil', exterieur: 'Croatie', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-13")
	      game1 = new Game(domicile: 'Mexique', exterieur: 'Cameroun', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Espagne', exterieur: 'Pays-Bas', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Chili', exterieur: 'Australie', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-14")
	      game1 = new Game(domicile: 'Colombie', exterieur: 'Grèce', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Uruguay', exterieur: 'Costa-Rica', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Cote d\'Ivoire', exterieur: 'Japon', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Angleterre', exterieur: 'Italie', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-15")
	      game1 = new Game(domicile: 'Suisse', exterieur: 'Equateur', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'France', exterieur: 'Honduras', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Argentine', exterieur: 'Bosnie', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-16")
	      game1 = new Game(domicile: 'Allemagne', exterieur: 'Portugal', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Iran', exterieur: 'Nigéria', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Ghana', exterieur: 'USA', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-17")
	      game1 = new Game(domicile: 'Belgique', exterieur: 'Algérie', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Brésil', exterieur: 'Mexique', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Russie', exterieur: 'Corée du sud', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-18")
	      game1 = new Game(domicile: 'Australie', exterieur: 'Pays-Bas', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Espagne', exterieur: 'Chili', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Cameroun', exterieur: 'Croatie', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-19")
	      game1 = new Game(domicile: 'Colombie', exterieur: 'Cote Ivoire', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Uruguay', exterieur: 'Angleterre', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Japon', exterieur: 'Grece', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-20")
	      game1 = new Game(domicile: 'Italie', exterieur: 'Costa Rica', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Suisse', exterieur: 'France', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Honduras', exterieur: 'Equateur', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-21")
	      game1 = new Game(domicile: 'Argentine', exterieur: 'Iran', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Allemagne', exterieur: 'Ghana', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Nigeria', exterieur: 'Bosnie', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-22")
	      game1 = new Game(domicile: 'Belgique', exterieur: 'Russie', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Corée', exterieur: 'Algérie', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'USA', exterieur: 'Portugal', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-23")
	      game1 = new Game(domicile: 'Pays-Bas', exterieur: 'Chili', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Australie', exterieur: 'Espagne', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Cameroun', exterieur: 'Brésil', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Croatie', exterieur: 'Mexique', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-24")
	      game1 = new Game(domicile: 'Italie', exterieur: 'Uruguay', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Costa-Rica', exterieur: 'Angleterre', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Japon', exterieur: 'Colombie', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Grece', exterieur: 'Cote Ivoire', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-25")
	      game1 = new Game(domicile: 'Nigeria', exterieur: 'Argentine', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Bosnie', exterieur: 'Iran', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Honduras', exterieur: 'Suisse', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Equateur', exterieur: 'France', starttime: d1).save(flush:true)

              d1 = new SimpleDateFormat("yyyy-MM-dd").parse("2014-06-26")
	      game1 = new Game(domicile: 'Portugal', exterieur: 'Ghana', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'USA', exterieur: 'Allemagne', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Corée', exterieur: 'Belgique', starttime: d1).save(flush:true)
	      game1 = new Game(domicile: 'Algérie', exterieur: 'Russie', starttime: d1).save(flush:true)
    }
}
