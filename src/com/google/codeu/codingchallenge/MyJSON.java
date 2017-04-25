// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.codeu.codingchallenge;

import java.util.Collection;
import java.util.HashMap;

final class MyJSON implements JSON {
//Initialize a variable named strData to a new instance of a hashmap object to store JSON string data
	private HashMap<String, String> strData = new HashMap<String, String>();
	
	//Initialize a variable named objData to a new instance of a hashmap object to store JSON object data
	private HashMap<String, JSON> objData = new HashMap<String, JSON>();
	
  @Override
  public JSON getObject(String name) {
    // TODO: implement this
	  
	  //Checks to see if the name exists in the hashmap
	 if(objData.containsKey(name)){
		 //Returns the obj if the name is valid
		 return objData.get(name);
	 }else{
		 //else returns null
		 return null;
	 }
  }

  @Override
  public JSON setObject(String name, JSON value) {
    // TODO: implement this
	
	  
	//Add the object to the objData Hashmap
	objData.put(name, value);                

	return this;
  }

  @Override
  public String getString(String name) {
	//Checks to see if the name exists in the hashmap
		 if(strData.containsKey(name)){
			 //Returns the str if the name is valid
			 return strData.get(name);
		 }else{
			 //else returns null
			 return null;
		 }
  }

  @Override
  public JSON setString(String name, String value) {
    // TODO: implement this
	  
	//Add the string to the strData Hashmap
	strData.put(name, value);

    return this;
  }

  @Override
  public void getObjects(Collection<String> names) {
    // TODO: implement this
	 
	  //Loop to get all the object keys 
	  for(String key : objData.keySet()){
		  //Adds the key to the name Collection
		  names.add(key);
	  }
  }

  @Override
  public void getStrings(Collection<String> names) {
    // TODO: implement this
   //Loop to get all the string keys 
	  for(String key : strData.keySet()){
		  //Adds the key to the name Collection
		  names.add(key);
	  }
  }
}
