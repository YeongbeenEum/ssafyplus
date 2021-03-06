package com.ssafy.springboot.web.dto.portfolio;

import com.ssafy.springboot.web.dto.portfolio.project.ProjectUpdateRequestDto;
import com.ssafy.springboot.web.dto.portfolio.skill.SkillUpdateRequestDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class PortfolioUpdateRequestDto {

    private String user_email;

    private String title;
    private String name;
    private String birth;
    private String email;
    private String phone;
    private String profile_image_url;

    private List<String> characters;
    private List<SkillUpdateRequestDto> skills;
    private List<ProjectUpdateRequestDto> projects;

    @Builder
    public PortfolioUpdateRequestDto(String title, String user_email, String name, String birth, String email, String phone,
                                     String profile_image_url, List<String> characters, List<SkillUpdateRequestDto> skills, List<ProjectUpdateRequestDto> projects) {
        this.user_email = user_email;

        this.title = title;
        this.name = name;
        this.birth = birth;
        this.email = email;
        this.phone = phone;
        this.profile_image_url = profile_image_url;
        this.characters = characters;
        this.skills = skills;
        this.projects = projects;
    }
}
