<?php

function returnBiodata ($name, $age){
    $list_school = array(
        array(
            "name" => "SMA N 2 Magelang",
            "year_in" => "2012",
            "year_out" => "2015",
            "major" => "IPA"
        ),
        array(
            "name" => "Universitas Diponegoro",
            "year_in" => "2015",
            "year_out" => "2019",
            "major" => "Computer Science"
        )
    ); 
    
    $skills = array(
        array(
            "skill_name" => "Apps Developer",
            "level" => "advanced"
        ),
        array(
            "skill_name" => "Data Scientist",
            "level" => "beginner"
        )
    );
    
    $post = array(
        "name" => $name,
        "age" => $age,
        "address" => "Tirtomulyo RT 01/ RW 02 Plantungan, Kendal",
        "hobbies" => array("Sports","Coding","News Reader"),
        "is_married" => false,
        "list_school" => $list_school,
        "skills" => $skills,
        "interest_in_coding" => true
    );
    
    echo json_encode($post);
}

returnBiodata("Roihan Auliya U","22");

?>