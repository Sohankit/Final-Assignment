package service;

import dto.BlogData;

public interface IBlogService {
	public String insertBlogData(BlogData data);
	public Integer findIdOfLatestInsertedRow();

	public BlogData getheBlogDataById(Integer id);
}
