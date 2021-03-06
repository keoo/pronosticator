package pronos
import pronos.Game;
import grails.plugin.springsecurity.annotation.Secured

@Secured(['ROLE_USER', 'ROLE_ADMIN'])
class StatisticController {

      def gameService
      def pronosticService
      def userService

      def index() {
      }

      def global() {
      	  def game = gameService.list()
	  def user = userService.list()
	  def prono = pronosticService.list()
	  [game:game, user:user, prono:prono]
      }

      def list(params) {
      	  def prono
	  def user
	  def id = params.id as int
	  if (id == -1){
	    prono = pronosticService.getByUser()
	    user = userService.getCurrentUser()
	  } else {
	    prono = pronosticService.getByGivenUser(params.id)
	    user = userService.get(params.id)
	  }
	  def total = 0
	  def judged = 0
	  def avg = 0
	  def perfect = 0
	  def great = 0
	  def good = 0
	  def bad = 0
	  def totalScore = 0
	  prono.each(){
		def pts = it
		def pt = pts.point
 	  		 total += 1
			 if (pt) {
			    judged += 1;
			    totalScore += pt
			    switch (pt) {
			    	   case 1:
				   	bad += 1
					break;
				   case 3:
				   	good += 1;
					break;
				   case 4:
				   	great += 1;
					break;
				   case 5:
				   	perfect += 1;
					break;
				   default:
					break;
				
			    }
			 }
	  };
          if (judged == 0) {
             avg = 0
          } else {
	  avg = totalScore / judged
          }
	  [total:total, bad: bad, good: good, great: great, perfect: perfect, judged : judged, totalScore: totalScore, avg : avg, user: user]
      }


      def prono() {
      	  def game = gameService.list()
	  def user = userService.list()
	  def prono = pronosticService.list()
	  def total = 0
	  def judged = 0
	  def avg = 0
	  def perfect = 0
	  def great = 0
	  def good = 0
	  def bad = 0
	  def totalScore = 0
	  prono.each(){
		def pts = it
		def pt = pts.point
 	  		 total += 1
			 if (pt) {
			    judged += 1;
			    totalScore += pt
			    switch (pt) {
			    	   case 1:
				   	bad += 1
					break;
				   case 3:
				   	good += 1;
					break;
				   case 4:
				   	great += 1;
					break;
				   case 5:
				   	perfect += 1;
					break;
				   default:
					break;
				
			    }
			 }
	  };
          if (judged == 0) {
             avg = 0
          } else {
	  avg = totalScore / judged
          }
	  [total:total, bad: bad, good: good, great: great, perfect: perfect, judged : judged, totalScore: totalScore, avg : avg]
      }


      def game(params){
	  def prono = pronosticService.getByGame(params.id)
          def game = gameService.get(params.id)
          def domicile = game.domicile
          def exterieur = game.exterieur
	  def totalScore = 0
	  def judged = 0
	  def avg = 0
	  def total = 0
	  def perfect = 0
	  def great = 0
	  def good = 0
	  def bad = 0
	  def totalDom = 0
	  def totalExt = 0
          def maxExt = 0
          def minExt = 0
          def maxDom = 0
          def minDom = 10
	  prono.each(){
		def pts = it
		def pt = pts.point
 	  		 total += 1
		totalDom += pts.b_domicile
		totalExt += pts.b_exterieur    
                if (pts.b_domicile>maxDom){
                   maxDom = pts.b_domicile
                }
                if (pts.b_exterieur>maxExt){
                   maxExt = pts.b_exterieur
                }
                if (pts.b_domicile<minDom){
                   minDom = pts.b_domicile
                }
                if (pts.b_exterieur<minExt){
                   minExt = pts.b_exterieur
                }
			 if (pt) {
			    judged += 1;
			    totalScore += pt
			    switch (pt) {
			    	   case 1:
				   	bad += 1
					break;
				   case 3:
				   	good += 1;
					break;
				   case 4:
				   	great += 1;
					break;
				   case 5:
				   	perfect += 1;
					break;
				   default:
					break;
				
			    }
			 }
	  };
          if (judged == 0) {
             avg = 0
          } else {
	  avg = totalScore / judged
          }
	  if (total > 0){
	     totalDom /= total
	     totalExt /= total
	  }

	  [total:total, bad: bad, good: good, great: great, perfect: perfect, totalScore: totalScore, avg : avg, totalDom: totalDom, totalExt: totalExt, minDom: minDom, maxDom: maxDom, minExt: minExt, maxExt: maxExt, domicile: domicile, exterieur: exterieur]

      }

}


