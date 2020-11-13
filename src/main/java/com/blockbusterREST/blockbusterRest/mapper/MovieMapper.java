package com.blockbusterREST.blockbusterRest.mapper;

import com.blockbusterREST.blockbusterRest.domain.Movie;
import com.blockbusterREST.blockbusterRest.dto.MovieDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MovieMapper {
    MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);
    Movie toEntity(MovieDto movieDto);
    MovieDto toDto(Movie movie);
    List<MovieDto> listToDto(List<Movie> movies);
}
