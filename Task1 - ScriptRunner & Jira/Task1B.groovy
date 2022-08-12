if(issue.key.toString().equals("AS-25")){
    // get list of sub-tasks
    def subTasksList = issue.getSubTaskObjects() 
    if(subTasksList.size() == 0){
        // custom field is hidden if list is empty
        return null
    }else{
        return subTasksList.size()
    }    
}