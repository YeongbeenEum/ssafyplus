package com.ssafy.springboot.web.dto.portfolio;

import com.ssafy.springboot.domain.portfolio.Portfolio;
import com.ssafy.springboot.domain.portfolio.project.Project;
import com.ssafy.springboot.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class PortfolioSaveRequestDto {

    private String user_email;
    private String name;
    private String birth;
    private String email;
    private String phone;
    private List<String> characters;
    private List<String> skills;
    private List<Project> projects;


    @Builder
    public PortfolioSaveRequestDto(String user_email, String name, String birth, String email, String phone,
                                   List<String> characters, List<String> skills, List<Project> projects) {
        this.user_email = user_email;
        this.name = name;
        this.birth = birth;
        this.email = email;
        this.phone = phone;
        this.characters = characters;
        this.skills = skills;
        this.projects = projects;
    }

    public Portfolio toEntity(User user) {
        return Portfolio.builder()
                .user(user)
                .name(name)
                .birth(birth)
                .email(email)
                .phone(phone)
                .characters(characters)
                .skills(skills)
                .projects(projects)
                .build();
    }

}