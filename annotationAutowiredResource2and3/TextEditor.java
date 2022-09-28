package com.spring.annotationAutowiredResource2and3;

import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.Resource;

public class TextEditor {
	
	//Autowired on Setter Methods

	 private SpellChecker spellChecker;
	 @Autowired
	 /*public void setSpellChecker( SpellChecker spellChecker ){
	 this.spellChecker = spellChecker;
	 }
	  public SpellChecker getSpellChecker(){
	  return spellChecker;
	  }
	 public void spellCheck() {
		 spellChecker.checkSpelling();
		 }
	
	//@Autowired on Constructors 
	 public TextEditor(SpellChecker spellChecker){
		 System.out.println("Inside TextEditor constructor." );
		 this.spellChecker = spellChecker;
		 }
	 public SpellChecker getSpellChecker( ) {
	 return spellChecker;
	 }
	*/ 
	  @Resource(name = "spellChecker")
	  public void setSpellChecker( SpellChecker spellChecker ){
	  this.spellChecker = spellChecker;
	  }
	  public SpellChecker getSpellChecker(){
	  return spellChecker;
	  }
	  public void spellCheck(){
	  spellChecker.checkSpelling();
	  }
	 

	 
	}


