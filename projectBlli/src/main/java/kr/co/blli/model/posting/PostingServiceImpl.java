package kr.co.blli.model.posting;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class PostingServiceImpl implements PostingService{
	@Resource
	private PostingDAO postingDAO;
	
}
