FROM debian:bookworm

RUN apt-get update && apt-get upgrade -y && apt-get install -y  \
	git-all \
	default-jre \
	maven \
	zsh \
	curl \
	neofetch \
	make

WORKDIR /swingy

RUN echo 'alias clean="clear; neofetch"' >> ~/.zshrc && source ~/.zshrc

CMD ["tail", "-f", "/dev/null"]