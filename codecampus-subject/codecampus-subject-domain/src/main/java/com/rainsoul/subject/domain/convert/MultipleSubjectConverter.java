package com.rainsoul.subject.domain.convert;

import com.rainsoul.subject.domain.entity.SubjectAnswerBO;
import com.rainsoul.subject.infra.basic.entity.SubjectMultiple;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MultipleSubjectConverter {

    MultipleSubjectConverter INSTANCE = Mappers.getMapper(MultipleSubjectConverter.class);

    SubjectMultiple convertBoToEntity(SubjectAnswerBO subjectAnswerBO);

    List<SubjectAnswerBO> convertEntityToBoList(List<SubjectMultiple> subjectMultipleList);


}