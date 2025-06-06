package org.example.project.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    public List<UserDTO> content;
    public Integer pageNumber;
    public Integer pageSize;
    public Long totalElements;
    public Integer totalPages;
    public Boolean lastPage;
}
