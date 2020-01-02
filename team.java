/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author kpsingh
 */
public class team {
   Member member;
   public team(Member member){
       this.member = member;
        
    }
   public class Member{
       private String name;
       private String type;
       private int level;
       private int rank;
       
       public Member(String name,String type,int level,int rank){
           this.name=name;
           this.type=type;
           this.level=level;
           this.rank=rank;
       }
   }
    
}

