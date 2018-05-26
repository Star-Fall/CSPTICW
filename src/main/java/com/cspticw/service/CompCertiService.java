package com.cspticw.service;

import java.util.List;

import com.cspticw.entity.CompInfoCerti;

public interface CompCertiService {

	CompInfoCerti findCertiInfobyCompId(Long compId);

	boolean addCompCertiInfo(CompInfoCerti record);

	boolean updateCompCertiInfo(CompInfoCerti record);

	List<CompInfoCerti> getCompCertiInfoAdmin(Integer isCertified);

	boolean updateCompCertiInfoAdmin(Long recordId, Integer isCertified);

}
