package pronos

class Game {
      String domicile
      String exterieur
      Integer bdomicile  = -1 // buts domicile
      Integer bexterieur = -1 // buts exterieur
      Date starttime

      static hasMany = [
             pronos: Pronostic
      ]


      def afterUpdate(){
          // Calculate all points on associated pronostics
      }
}