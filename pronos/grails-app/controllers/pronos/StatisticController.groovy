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

      def user() {
      	  def game = gameService.list()
	  def user = userService.list()
	  def prono = pronosticService.getByUser()
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

      def list(params) {
	  def prono = pronosticService.getByGivenUser(params.id)
	  def user = userService.get(params.id)
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


}


