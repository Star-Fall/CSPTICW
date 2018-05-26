package com.cspticw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cspticw.dao.CompInfoCertiMapper;
import com.cspticw.entity.CompInfoCerti;
import com.cspticw.entity.CompInfoCertiExample;
import com.cspticw.entity.CompInfoCertiExample.Criteria;
import com.cspticw.service.CompCertiService;

@Service
public class CompCertiServiceImpl implements CompCertiService {

	@Autowired
	private CompInfoCertiMapper compInfoCertiMapper;

	@Override
	public CompInfoCerti findCertiInfobyCompId(Long compId) {
		CompInfoCertiExample example = new CompInfoCertiExample();
		Criteria criteria = example.createCriteria();
		criteria.andCompIdEqualTo(compId);
		List<CompInfoCerti> list = compInfoCertiMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		} else {
			return null;
		}
	}

	@Transactional
	@Override
	public boolean addCompCertiInfo(CompInfoCerti record) {
		record.preInsert();
		record.setIsCertified(2);
		int i = compInfoCertiMapper.insert(record);
		return i == 1;
	}

	@Transactional
	@Override
	public boolean updateCompCertiInfo(CompInfoCerti record) {
		record.preUpdate();
		record.setIsCertified(2);
		int i = compInfoCertiMapper.updateByPrimaryKeySelective(record);
		return i == 1;
	}

	@Override
	public List<CompInfoCerti> getCompCertiInfoAdmin(Integer isCertified) {
		CompInfoCertiExample example = new CompInfoCertiExample();
		Criteria criteria = example.createCriteria();
		if (isCertified != null) {
			criteria.andIsCertifiedEqualTo(isCertified);
		}
		List<CompInfoCerti> list = compInfoCertiMapper.selectByExample(example);
		return list;
	}

	@Transactional
	@Override
	public boolean updateCompCertiInfoAdmin(Long recordId, Integer isCertified) {
		CompInfoCerti record = new CompInfoCerti();
		record.setId(recordId);
		record.setIsCertified(isCertified);
		record.preUpdate();
		int i = compInfoCertiMapper.updateByPrimaryKeySelective(record);
		return i == 1;
	}

}
