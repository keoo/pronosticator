package game

class User{
      transient springSecurityService
      static searchable = true
      String firstname
      String lastname
      String username
      String password
      String email
      Integer activated = 0 // 0 = wait to be activated, 1 = activated, -1 is refused
      Boolean isAdmin = false
      static hasMany = [
             prono:Pronostic
      ]

      def beforeInsert(){
          encodePassword()
      }

      protected void encodePassword() {
                password = springSecurityService.encodePassword(password,this.username)
      }

      static mapping = {
             table 'users'
             id column: "numuserid", generator: 'identity'
             version false
      }

      static constraints = {
             username nullable: false, blank: false, unique: true
             password nullable: false, blank: false
             firstname nullable: false, blank: false
             lastname nullable: false, blank: false
      }

}