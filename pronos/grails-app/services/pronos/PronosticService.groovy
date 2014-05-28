package pronos
import pronos.Pronostic;


class PronosticService {
      def userService
      def gameService

       def list (Map params = null){
           return Pronostic.findAll()
	}
	def get (def id){
      	       return Pronostic.get(id)
	}
	def getByUser (Map params){
          	def user = userService.getCurrentUser()
                def query = Pronostic.where {
                   user == user
                }
      	        return query
	}
	def create (Map params){
	  	def user = userService.getCurrentUser()
                def res = Pronostic.findByGameAndUser(gameService.get(params.game), user)
                if (!res) {
                     res = new Pronostic()
                     res.game = gameService.get(params.game)
                     res.user = user
                }

		res.b_domicile = params.b_domicile as int
		res.b_exterieur = params.b_exterieur as int
                Date d1 = new Date()
                res.time = d1

                res.save(flush:true)
	}
}

