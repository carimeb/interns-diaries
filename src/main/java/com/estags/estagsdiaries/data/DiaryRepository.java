package com.estags.estagsdiaries.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  //cuidarĂ¡ do CRUD - create, retrive (read), update, delete - com o BD
public interface DiaryRepository extends JpaRepository<Diary, Long> {


}
