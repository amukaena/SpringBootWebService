package com.amu.springbootwebservice.Service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.hibernate.engine.jdbc.connections.spi.AbstractDataSourceBasedMultiTenantConnectionProviderImpl;
import org.springframework.stereotype.Service;

import com.amu.springbootwebservice.DTO.PostsMainResponseDTO;
import com.amu.springbootwebservice.DTO.PostsSaveRequestDTO;
import com.amu.springbootwebservice.Domain.PostsRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PostsService {
	private PostsRepository postsRepository;
	
	@Transactional
	public Long save(PostsSaveRequestDTO dto)
	{
		return postsRepository.save(dto.toEntity()).getId();
	}
	
	@Transactional
	public List<PostsMainResponseDTO> findAllDesc()
	{
		return postsRepository.findAllDesc()
				.map(PostsMainResponseDTO::new)
				.collect(Collectors.toList());
	}
}
