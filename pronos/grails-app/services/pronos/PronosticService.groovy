package pronos
import pronos.Pronostic;


class PronosticService {
      def userService
       def list (Map params = null){
           return Pronostic.findAll(params)
	}
	def get (def id){
      	       return Pronostic.get(id)
	}
	def create (Map params){
	  	def user = userService.getCurrentUser()
		def res = new Pronostic()
		res.b_domicile = params.b_domicile
		res.b_exterieur = params.b_exterieur
	}
}

