package com.starters;

public class PortfolioLikeVO {

	private int portfolioId;
	private String portfolioTitle;
	private String portfolioMethod;
	private String portfolioUrl;
	private String portfolioFile;
	private String portfolioText;
	private String uploadDate;
	private int portfolioCount; // 조회수
	private int portfolioLikeCount;
	private int portfolioLikeCounts; // 전체수

	private String name;

	public int getPortfolioId() {
		return portfolioId;
	}

	public void setPortfolioId(int portfolioId) {
		this.portfolioId = portfolioId;
	}

	public String getPortfolioTitle() {
		return portfolioTitle;
	}

	public void setPortfolioTitle(String portfolioTitle) {
		this.portfolioTitle = portfolioTitle;
	}

	public String getPortfolioMethod() {
		return portfolioMethod;
	}

	public void setPortfolioMethod(String portfolioMethod) {
		this.portfolioMethod = portfolioMethod;
	}

	public String getPortfolioUrl() {
		return portfolioUrl;
	}

	public void setPortfolioUrl(String portfolioUrl) {
		this.portfolioUrl = portfolioUrl;
	}

	public String getPortfolioFile() {
		return portfolioFile;
	}

	public void setPortfolioFile(String portfolioFile) {
		this.portfolioFile = portfolioFile;
	}

	public String getPortfolioText() {
		return portfolioText;
	}

	public void setPortfolioText(String portfolioText) {
		this.portfolioText = portfolioText;
	}

	public String getUploadDate() {
		return uploadDate;
	}

	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}

	public int getPortfolioCount() {
		return portfolioCount;
	}

	public void setPortfolioCount(int portfolioCount) {
		this.portfolioCount = portfolioCount;
	}

	public int getPortfolioLikeCount() {
		return portfolioLikeCount;
	}

	public void setPortfolioLikeCount(int portfolioLikeCount) {
		this.portfolioLikeCount = portfolioLikeCount;
	}

	public int getPortfolioLikeCounts() {
		return portfolioLikeCounts;
	}

	public void setPortfolioLikeCounts(int portfolioLikeCounts) {
		this.portfolioLikeCounts = portfolioLikeCounts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PortfolioLikeVO [portfolioId=" + portfolioId + ", portfolioTitle=" + portfolioTitle
				+ ", portfolioMethod=" + portfolioMethod + ", portfolioUrl=" + portfolioUrl + ", portfolioFile="
				+ portfolioFile + ", portfolioText=" + portfolioText + ", uploadDate=" + uploadDate
				+ ", portfolioCount=" + portfolioCount + ", portfolioLikeCount=" + portfolioLikeCount
				+ ", portfolioLikeCounts=" + portfolioLikeCounts + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + portfolioCount;
		result = prime * result + ((portfolioFile == null) ? 0 : portfolioFile.hashCode());
		result = prime * result + portfolioId;
		result = prime * result + portfolioLikeCount;
		result = prime * result + portfolioLikeCounts;
		result = prime * result + ((portfolioMethod == null) ? 0 : portfolioMethod.hashCode());
		result = prime * result + ((portfolioText == null) ? 0 : portfolioText.hashCode());
		result = prime * result + ((portfolioTitle == null) ? 0 : portfolioTitle.hashCode());
		result = prime * result + ((portfolioUrl == null) ? 0 : portfolioUrl.hashCode());
		result = prime * result + ((uploadDate == null) ? 0 : uploadDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PortfolioLikeVO other = (PortfolioLikeVO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (portfolioCount != other.portfolioCount)
			return false;
		if (portfolioFile == null) {
			if (other.portfolioFile != null)
				return false;
		} else if (!portfolioFile.equals(other.portfolioFile))
			return false;
		if (portfolioId != other.portfolioId)
			return false;
		if (portfolioLikeCount != other.portfolioLikeCount)
			return false;
		if (portfolioLikeCounts != other.portfolioLikeCounts)
			return false;
		if (portfolioMethod == null) {
			if (other.portfolioMethod != null)
				return false;
		} else if (!portfolioMethod.equals(other.portfolioMethod))
			return false;
		if (portfolioText == null) {
			if (other.portfolioText != null)
				return false;
		} else if (!portfolioText.equals(other.portfolioText))
			return false;
		if (portfolioTitle == null) {
			if (other.portfolioTitle != null)
				return false;
		} else if (!portfolioTitle.equals(other.portfolioTitle))
			return false;
		if (portfolioUrl == null) {
			if (other.portfolioUrl != null)
				return false;
		} else if (!portfolioUrl.equals(other.portfolioUrl))
			return false;
		if (uploadDate == null) {
			if (other.uploadDate != null)
				return false;
		} else if (!uploadDate.equals(other.uploadDate))
			return false;
		return true;
	}

	public PortfolioLikeVO(int portfolioId, String portfolioTitle, String portfolioMethod, String portfolioUrl,
			String portfolioFile, String portfolioText, String uploadDate, int portfolioCount, int portfolioLikeCount,
			int portfolioLikeCounts, String name) {
		super();
		this.portfolioId = portfolioId;
		this.portfolioTitle = portfolioTitle;
		this.portfolioMethod = portfolioMethod;
		this.portfolioUrl = portfolioUrl;
		this.portfolioFile = portfolioFile;
		this.portfolioText = portfolioText;
		this.uploadDate = uploadDate;
		this.portfolioCount = portfolioCount;
		this.portfolioLikeCount = portfolioLikeCount;
		this.portfolioLikeCounts = portfolioLikeCounts;
		this.name = name;
	}

	
	
	
}
