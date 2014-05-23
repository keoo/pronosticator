Class Pronostic {
      Integer b_domicile  // buts domicile
      Integer b_exterieur // buts exterieur
      Match match
      User user
      Date time
      static belongsTo = [Match, User]
      static mapping = {
             id column: "id", generator: 'identity'
             version false
      }
      Integer point = 0
      beforeUpdate(){
        // Check time is before match
      }
}